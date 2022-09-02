-- 1158. Market Analysis I
SELECT U.user_id AS buyer_id, U.join_date, COUNT(O.order_id) AS orders_in_2019
FROM Users U
LEFT JOIN Orders O ON U.user_id = O.buyer_id AND YEAR(order_date) = '2019'
GROUP BY user_id
ORDER BY user_id;