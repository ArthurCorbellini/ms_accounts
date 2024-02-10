package com.corbellini.accounts.mapper;

import com.corbellini.accounts.dto.AccountDto;
import com.corbellini.accounts.entity.Account;

public class AccountMapper {

  public static AccountDto mapToAccountsDto(Account account, AccountDto accountDto) {
    accountDto.setAccountNumber(account.getAccountNumber());
    accountDto.setAccountType(account.getAccountType());
    accountDto.setBranchAddress(account.getBranchAddress());
    return accountDto;
  }

  public static Account mapToAccounts(AccountDto accountDto, Account account) {
    account.setAccountNumber(accountDto.getAccountNumber());
    account.setAccountType(accountDto.getAccountType());
    account.setBranchAddress(accountDto.getBranchAddress());
    return account;
  }
}
