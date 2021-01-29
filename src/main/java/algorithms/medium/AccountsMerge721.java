package algorithms.medium;

import Bean.UnionFind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/accounts-merge/
 */
public class AccountsMerge721 {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> emailsToIndex = new HashMap<>();
        Map<String, String> emailsToName = new HashMap<>();
        int emailCount = 0;
        for (List<String> account : accounts) {
            String name = account.get(0);
            int size = account.size();
            for (int i = 1; i < size; i++) {
                String email = account.get(i);
                if (!emailsToIndex.containsKey(email)) {
                    emailsToIndex.put(email, emailCount++);
                    emailsToName.put(email, name);
                }
            }
        }
        UnionFind uf = new UnionFind(emailCount);
        for (List<String> account : accounts) {
            String email = account.get(1);
            Integer index = emailsToIndex.get(email);
            int size = account.size();
            for (int i = 2; i < size; i++) {
                String nextEmail = account.get(i);
                Integer nextIndex = emailsToIndex.get(nextEmail);
                uf.union(index, nextIndex);
            }
        }
        Map<Integer, List<String>> indexToEmails = new HashMap<>();
        for (String email : emailsToIndex.keySet()) {
            int index = uf.find(emailsToIndex.get(email));
            List<String> account = indexToEmails.getOrDefault(index, new ArrayList<>());
            account.add(email);
            indexToEmails.put(index, account);
        }
        List<List<String>> merged = new ArrayList<>();
        for (List<String> emails : indexToEmails.values()) {
            List<String> account = new ArrayList<>();
            Collections.sort(emails);
            String name = emailsToName.get(emails.get(0));
            account.add(name);
            account.addAll(emails);
            merged.add(account);
        }
        return merged;
    }

}
