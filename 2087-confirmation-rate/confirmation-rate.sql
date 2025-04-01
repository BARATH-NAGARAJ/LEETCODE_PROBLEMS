-- SELECT USER_ID, IFNULL(ROUND(AVG(ACTION = 'confirmed'), 2),0.00) AS CONFIRMATION_RATE FROM SIGNUPS S LEFT JOIN CONFIRMATIONS C ON S.USER_ID = C.USER_ID GROUP BY S.USER_ID

select s.user_id, round(avg(if(c.action="confirmed",1,0)),2) as confirmation_rate
from Signups as s left join Confirmations as c on s.user_id= c.user_id group by user_id;

