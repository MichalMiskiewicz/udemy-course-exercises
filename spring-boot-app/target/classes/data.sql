use company;
delete from users;
insert into users (name, surname, email, city) values
('Ola', 'Kowalska', 'ola@example.com', 'Warszawa'),
('Ania', 'Kot', 'ania@example.com', 'Kraków'),
('Paweł', 'Miek', 'pawel@example.com', 'Bydgoszcz');