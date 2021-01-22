# Simon LDAP Demo


### 知识扫盲

#### LDAP简称对应
* o– organization（组织-公司）
* ou – organization unit（组织单元-部门）
* c - countryName（国家）
* dc - domainComponent（域名）
* sn – suer name（真实名称）
* cn - common name（常用名称）

#### LDAP专用名词
**Objectclass**

LDAP对象类，是LDAP内置的数据模型，一个条目必须包含一个对象类，且需要赋予至少一个值。
objectClass有着严格的等级之分，最顶层是top和alias

objectClass可分为以下3类：
* 结构型（Structural）：如account、inetOrgPerson、person和organizationUnit；
* 辅助型（Auxiliary）：如extensibeObject；
* 抽象型（Abstract）：如top，抽象型的objectClass不能直接使用。

**Entry**

entry可以称为条目，一个entry就是一条记录，是LDAP中一个基本的存储单元

**DN**

Distinguished Name, LDAP中entry的唯一别名，一条完整的DN写法
```
dn: uid=zhang,ou=person,dc=simon,dc=com
```
