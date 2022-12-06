insert into tbl_department (departmentId, departmentName, status) values (1, 'IT Department', 'CREATED');

insert into tbl_employee_type (typeId, typeName, typeCost, status) values (1, 'Manager', 10, 'CREATED');
insert into tbl_employee_type (typeId, typeName, typeCost, status) values (2, 'QA Tester', 14, 'CREATED');
insert into tbl_employee_type (typeId, typeName, typeCost, status) values (3, 'Junior Developer', 25, 'CREATED');
insert into tbl_employee_type (typeId, typeName, typeCost, status) values (4, 'Senior Developer', 35, 'CREATED');

insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (1, 'Manager A', 1, 1, null, 'CREATED');
insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (2, 'Manager B', 1, 1, 1, 'CREATED');
insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (3, 'Manager C', 1, 1, null, 'CREATED');
insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (4, 'Manager D', 1, 1, 3, 'CREATED');
insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (5, 'Manager E', 1, 1, 3, 'CREATED');
insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (6, 'Manager F', 1, 1, 5, 'CREATED');

insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (7, 'QA Tester A', 1, 2, 1, 'CREATED');
insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (8, 'QA Tester B', 1, 2, 4, 'CREATED');
insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (9, 'QA Tester C', 1, 2, 6, 'CREATED');

insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (10, 'Junior Developer A', 1, 3, 1, 'CREATED');
insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (11, 'Junior Developer B', 1, 3, 4, 'CREATED');

insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (12, 'Senior Developer A', 1, 4, 2, 'CREATED');
insert into tbl_employee (employeeId, employeeName, departmentId, typeId, managerId, status) values (13, 'Senior Developer B', 1, 4, 4, 'CREATED');