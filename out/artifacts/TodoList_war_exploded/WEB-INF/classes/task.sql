create database xxx;
go

use xxx;
go

create table task
(
	id int identity primary key,-- ���
	body varchar(50) not null, -- ����
	state int, -- ����
	created datetime default getdate() -- ʱ��
)
go

select * from task;
-- ע�ͣ�2 ��ʾ����ɵ�����
-- 8 ��ʾδ���������ɾ��������
-- 9 ��ʾ�����������ɾ��������