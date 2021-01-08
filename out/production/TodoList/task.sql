create database xxx;
go

use xxx;
go

create table task
(
	id int identity primary key,-- 编号
	body varchar(50) not null, -- 内容
	state int, -- 属性
	created datetime default getdate() -- 时间
)
go

select * from task;
-- 注释：2 表示已完成的任务
-- 8 表示未完成任务中删除的数据
-- 9 表示已完成任务中删除的数据