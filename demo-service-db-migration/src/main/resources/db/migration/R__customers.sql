CREATE TABLE IF NOT EXISTS `customers` (
  `id`           INT AUTO_INCREMENT,
  `status`       VARCHAR(50)    NOT NULL,
  `email`        VARCHAR(50)    NOT NULL UNIQUE,
  `first_name`   VARCHAR(50)    NOT NULL,
  `last_name`    VARCHAR(50)    NULL,
  `create_time`  TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_time` TIMESTAMP      NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  Index `ix_email`(`email`)
)
ENGINE=InnoDB;
