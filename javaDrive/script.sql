USE [master]
GO
/****** Object:  Database [QLSach]    Script Date: 11/11/2020 9:42:52 AM ******/
CREATE DATABASE [QLSach]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QLSach', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SURFACE1989\MSSQL\DATA\QLSach.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'QLSach_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.SURFACE1989\MSSQL\DATA\QLSach_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [QLSach] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLSach].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLSach] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLSach] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLSach] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLSach] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLSach] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLSach] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QLSach] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLSach] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLSach] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLSach] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLSach] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLSach] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLSach] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLSach] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLSach] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QLSach] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLSach] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLSach] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLSach] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLSach] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLSach] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLSach] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLSach] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QLSach] SET  MULTI_USER 
GO
ALTER DATABASE [QLSach] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLSach] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLSach] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLSach] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [QLSach] SET DELAYED_DURABILITY = DISABLED 
GO
USE [QLSach]
GO
/****** Object:  Table [dbo].[loaiSach]    Script Date: 11/11/2020 9:42:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[loaiSach](
	[maLoai] [nchar](10) NOT NULL,
	[tenLoai] [nvarchar](50) NULL,
 CONSTRAINT [PK_loaiSach] PRIMARY KEY CLUSTERED 
(
	[maLoai] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[order_sach]    Script Date: 11/11/2020 9:42:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[order_sach](
	[orderID] [nchar](20) NOT NULL,
	[maSach] [nchar](10) NOT NULL,
	[soLuong] [int] NULL,
	[daThanhToan] [int] NULL,
 CONSTRAINT [PK_order_sach] PRIMARY KEY CLUSTERED 
(
	[orderID] ASC,
	[maSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[orders]    Script Date: 11/11/2020 9:42:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[orders](
	[orderID] [nchar](20) NOT NULL,
	[id] [nchar](20) NULL,
	[ngayLap] [date] NULL,
 CONSTRAINT [PK_orders] PRIMARY KEY CLUSTERED 
(
	[orderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[sach]    Script Date: 11/11/2020 9:42:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sach](
	[maSach] [nchar](10) NOT NULL,
	[tenSach] [nvarchar](50) NULL,
	[tacGia] [nvarchar](50) NULL,
	[giaBan] [int] NULL,
	[img] [nchar](50) NULL,
	[maLoai] [nchar](10) NULL,
 CONSTRAINT [PK_sach] PRIMARY KEY CLUSTERED 
(
	[maSach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[users]    Script Date: 11/11/2020 9:42:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[users](
	[id] [nchar](20) NOT NULL,
	[pass] [nchar](50) NULL,
 CONSTRAINT [PK_users] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  View [dbo].[abc]    Script Date: 11/11/2020 9:42:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[abc]
AS
SELECT     dbo.sach.tensach, dbo.loai.tenloai, dbo.ChiTietHoaDon.SoLuongMua
FROM         dbo.ChiTietHoaDon INNER JOIN
                      dbo.sach ON dbo.ChiTietHoaDon.MaSach = dbo.sach.masach INNER JOIN
                      dbo.loai ON dbo.sach.maloai = dbo.loai.maloai

GO
/****** Object:  View [dbo].[Vqq]    Script Date: 11/11/2020 9:42:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[Vqq]
AS
SELECT     dbo.loai.tenloai, dbo.sach.tensach, dbo.sach.tacgia, dbo.ChiTietHoaDon.SoLuongMua
FROM         dbo.ChiTietHoaDon INNER JOIN
                      dbo.hoadon ON dbo.ChiTietHoaDon.MaHoaDon = dbo.hoadon.MaHoaDon INNER JOIN
                      dbo.sach ON dbo.ChiTietHoaDon.MaSach = dbo.sach.masach INNER JOIN
                      dbo.loai ON dbo.sach.maloai = dbo.loai.maloai

GO
/****** Object:  View [dbo].[VTamBay]    Script Date: 11/11/2020 9:42:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE VIEW [dbo].[VTamBay]
AS
SELECT     dbo.ChiTietHoaDon.MaSach, dbo.ChiTietHoaDon.SoLuongMua, dbo.hoadon.makh, dbo.hoadon.NgayMua, dbo.KhachHang.diachi, dbo.KhachHang.hoten, 
                      dbo.sach.tensach, dbo.sach.tacgia
FROM         dbo.ChiTietHoaDon INNER JOIN
                      dbo.hoadon ON dbo.ChiTietHoaDon.MaHoaDon = dbo.hoadon.MaHoaDon INNER JOIN
                      dbo.KhachHang ON dbo.hoadon.makh = dbo.KhachHang.Makh INNER JOIN
                      dbo.sach ON dbo.ChiTietHoaDon.MaSach = dbo.sach.masach INNER JOIN
                      dbo.loai ON dbo.sach.maloai = dbo.loai.maloai

GO
INSERT [dbo].[loaiSach] ([maLoai], [tenLoai]) VALUES (N'L01       ', N'Trinh thám')
INSERT [dbo].[loaiSach] ([maLoai], [tenLoai]) VALUES (N'L02       ', N'Khoa học viễn tưởng')
INSERT [dbo].[loaiSach] ([maLoai], [tenLoai]) VALUES (N'L03       ', N'Truyện tranh')
INSERT [dbo].[loaiSach] ([maLoai], [tenLoai]) VALUES (N'L04       ', N'Truyện ma')
INSERT [dbo].[loaiSach] ([maLoai], [tenLoai]) VALUES (N'L05       ', N'Tin học')
INSERT [dbo].[loaiSach] ([maLoai], [tenLoai]) VALUES (N'L06       ', N'Toán')
INSERT [dbo].[loaiSach] ([maLoai], [tenLoai]) VALUES (N'L07       ', N'Lịch sử')
INSERT [dbo].[loaiSach] ([maLoai], [tenLoai]) VALUES (N'L08       ', N'Văn học')
INSERT [dbo].[loaiSach] ([maLoai], [tenLoai]) VALUES (N'L09       ', N'Tâm linh')
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'C7d53IIxnK          ', N'S01       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'C7d53IIxnK          ', N'S02       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'C7d53IIxnK          ', N'S03       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'C7d53IIxnK          ', N'S04       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'C7d53IIxnK          ', N'S05       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'C7d53IIxnK          ', N'S10       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'DR1oeRCdoU          ', N'S03       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'DR1oeRCdoU          ', N'S04       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'DR1oeRCdoU          ', N'S05       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'DR1oeRCdoU          ', N'S09       ', 2, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'GYk9oiXuFr          ', N'S02       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'Hg89GFA83I          ', N'S01       ', 2, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'Hg89GFA83I          ', N'S02       ', 2, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'Hg89GFA83I          ', N'S03       ', 2, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'Hg89GFA83I          ', N'S06       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'PnnQC3G64C          ', N'S02       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'PnnQC3G64C          ', N'S03       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'PnnQC3G64C          ', N'S05       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'PnnQC3G64C          ', N'S06       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'PnnQC3G64C          ', N'S08       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'QQtMRtzzxa          ', N'S01       ', 3, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'QQtMRtzzxa          ', N'S02       ', 5, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'QQtMRtzzxa          ', N'S05       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'SrsBokUxXG          ', N'S02       ', 3, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'SrsBokUxXG          ', N'S03       ', 4, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'SrsBokUxXG          ', N'S05       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'yigeLoNkPJ          ', N'S05       ', 1, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'zTi9GeT0TO          ', N'S01       ', 4, 0)
INSERT [dbo].[order_sach] ([orderID], [maSach], [soLuong], [daThanhToan]) VALUES (N'zTi9GeT0TO          ', N'S03       ', 4, 0)
INSERT [dbo].[orders] ([orderID], [id], [ngayLap]) VALUES (N'C7d53IIxnK          ', N'ttmd210899          ', CAST(N'2020-11-09' AS Date))
INSERT [dbo].[orders] ([orderID], [id], [ngayLap]) VALUES (N'DR1oeRCdoU          ', N'ttmd210899          ', CAST(N'2020-11-09' AS Date))
INSERT [dbo].[orders] ([orderID], [id], [ngayLap]) VALUES (N'GYk9oiXuFr          ', N'ttmd210899          ', CAST(N'2020-11-10' AS Date))
INSERT [dbo].[orders] ([orderID], [id], [ngayLap]) VALUES (N'Hg89GFA83I          ', N'ttmd210899          ', CAST(N'2020-11-10' AS Date))
INSERT [dbo].[orders] ([orderID], [id], [ngayLap]) VALUES (N'HnUzzY4OaA          ', N'surface1989         ', CAST(N'2020-11-09' AS Date))
INSERT [dbo].[orders] ([orderID], [id], [ngayLap]) VALUES (N'PnnQC3G64C          ', N'ttmd210899          ', CAST(N'2020-11-10' AS Date))
INSERT [dbo].[orders] ([orderID], [id], [ngayLap]) VALUES (N'QQtMRtzzxa          ', N'ttmd210899          ', CAST(N'2020-11-10' AS Date))
INSERT [dbo].[orders] ([orderID], [id], [ngayLap]) VALUES (N'SrsBokUxXG          ', N'surface1989         ', CAST(N'2020-11-09' AS Date))
INSERT [dbo].[orders] ([orderID], [id], [ngayLap]) VALUES (N'yigeLoNkPJ          ', N'surface1989         ', CAST(N'2020-11-10' AS Date))
INSERT [dbo].[orders] ([orderID], [id], [ngayLap]) VALUES (N'zTi9GeT0TO          ', N'surface1989         ', CAST(N'2020-11-10' AS Date))
INSERT [dbo].[sach] ([maSach], [tenSach], [tacGia], [giaBan], [img], [maLoai]) VALUES (N'S01       ', N'Chiến tranh và hòa bình', N'Trinh Công Sơn', 19500, N'sach1.jpg                                         ', N'L01       ')
INSERT [dbo].[sach] ([maSach], [tenSach], [tacGia], [giaBan], [img], [maLoai]) VALUES (N'S02       ', N'Oan hồn ma nữ', N'Ngô Kha', 25600, N'sach2.jpg                                         ', N'L03       ')
INSERT [dbo].[sach] ([maSach], [tenSach], [tacGia], [giaBan], [img], [maLoai]) VALUES (N'S03       ', N'Cảnh giới tối cao', N'Hoàng Ngọ Thành', 35000, N'sach3.jpg                                         ', N'L05       ')
INSERT [dbo].[sach] ([maSach], [tenSach], [tacGia], [giaBan], [img], [maLoai]) VALUES (N'S04       ', N'Hoàng hoa thám', N'Đinh Thán Hoa', 98000, N'sach4.jpg                                         ', N'L01       ')
INSERT [dbo].[sach] ([maSach], [tenSach], [tacGia], [giaBan], [img], [maLoai]) VALUES (N'S05       ', N'Cuộc phiêu lưu của Doremon', N'Trương Minh Đức', 35000, N'sach5.jpg                                         ', N'L03       ')
INSERT [dbo].[sach] ([maSach], [tenSach], [tacGia], [giaBan], [img], [maLoai]) VALUES (N'S06       ', N'Lịch sử văn học Việt Nam', N'Nguyễn Trãi', 150000, N'sach6.jpg                                         ', N'L01       ')
INSERT [dbo].[sach] ([maSach], [tenSach], [tacGia], [giaBan], [img], [maLoai]) VALUES (N'S07       ', N'Cẩm y vệ', N'Lịch sử Trung Hoa', 200000, N'sach7.jpg                                         ', N'L05       ')
INSERT [dbo].[sach] ([maSach], [tenSach], [tacGia], [giaBan], [img], [maLoai]) VALUES (N'S08       ', N'Người hùng biển cả', N'An-dex-cent', 155000, N'sach8.jpg                                         ', N'L03       ')
INSERT [dbo].[sach] ([maSach], [tenSach], [tacGia], [giaBan], [img], [maLoai]) VALUES (N'S09       ', N'Tiếng gọi nơi hoang dã', N'Cúc Tịnh Y', 50000, N'anh9.jpg                                          ', N'L05       ')
INSERT [dbo].[sach] ([maSach], [tenSach], [tacGia], [giaBan], [img], [maLoai]) VALUES (N'S10       ', N'Oan hồn tỉnh lại', N'Truyện ma Dân gian', 67000, N'anh10.jpg                                         ', N'L01       ')
INSERT [dbo].[users] ([id], [pass]) VALUES (N'anh12               ', N'123                                               ')
INSERT [dbo].[users] ([id], [pass]) VALUES (N'bo1125              ', N'1123                                              ')
INSERT [dbo].[users] ([id], [pass]) VALUES (N'nguyenanh1125       ', N'123456789                                         ')
INSERT [dbo].[users] ([id], [pass]) VALUES (N'surface1989         ', N'21081999                                          ')
INSERT [dbo].[users] ([id], [pass]) VALUES (N'trieuvy1989         ', N'21081989                                          ')
INSERT [dbo].[users] ([id], [pass]) VALUES (N'ttmd210899          ', N'210899                                            ')
ALTER TABLE [dbo].[order_sach]  WITH CHECK ADD  CONSTRAINT [FK_order_sach_orders] FOREIGN KEY([orderID])
REFERENCES [dbo].[orders] ([orderID])
GO
ALTER TABLE [dbo].[order_sach] CHECK CONSTRAINT [FK_order_sach_orders]
GO
ALTER TABLE [dbo].[order_sach]  WITH CHECK ADD  CONSTRAINT [FK_order_sach_sach] FOREIGN KEY([maSach])
REFERENCES [dbo].[sach] ([maSach])
GO
ALTER TABLE [dbo].[order_sach] CHECK CONSTRAINT [FK_order_sach_sach]
GO
ALTER TABLE [dbo].[orders]  WITH CHECK ADD  CONSTRAINT [FK_orders_users] FOREIGN KEY([id])
REFERENCES [dbo].[users] ([id])
GO
ALTER TABLE [dbo].[orders] CHECK CONSTRAINT [FK_orders_users]
GO
ALTER TABLE [dbo].[sach]  WITH CHECK ADD  CONSTRAINT [FK_sach_loaiSach] FOREIGN KEY([maLoai])
REFERENCES [dbo].[loaiSach] ([maLoai])
GO
ALTER TABLE [dbo].[sach] CHECK CONSTRAINT [FK_sach_loaiSach]
GO
/****** Object:  StoredProcedure [dbo].[TimKiem]    Script Date: 11/11/2020 9:42:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[TimKiem](@bien nvarchar(5))
as
  select * from sach where maloai =@bien

GO
/****** Object:  StoredProcedure [dbo].[TimMaLoai]    Script Date: 11/11/2020 9:42:52 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
create procedure [dbo].[TimMaLoai]( @maloai nvarchar(50))
as
select * from sach where maloai=@maloai

GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[41] 4[21] 2[23] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "ChiTietHoaDon"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 125
               Right = 198
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "loai"
            Begin Extent = 
               Top = 6
               Left = 236
               Bottom = 95
               Right = 396
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "sach"
            Begin Extent = 
               Top = 6
               Left = 434
               Bottom = 125
               Right = 594
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
      Begin ColumnWidths = 9
         Width = 284
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'abc'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=1 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'abc'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[41] 4[21] 2[14] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = 0
         Left = 0
      End
      Begin Tables = 
         Begin Table = "ChiTietHoaDon"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 125
               Right = 198
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "hoadon"
            Begin Extent = 
               Top = 6
               Left = 236
               Bottom = 125
               Right = 396
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "loai"
            Begin Extent = 
               Top = 6
               Left = 434
               Bottom = 95
               Right = 594
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "sach"
            Begin Extent = 
               Top = 5
               Left = 580
               Bottom = 124
               Right = 740
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
      Begin ColumnWidths = 9
         Width = 284
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
         Width = 1500
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or = 1350
      End
   End' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'Vqq'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane2', @value=N'
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'Vqq'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=2 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'Vqq'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane1', @value=N'[0E232FF0-B466-11cf-A24F-00AA00A3EFFF, 1.00]
Begin DesignProperties = 
   Begin PaneConfigurations = 
      Begin PaneConfiguration = 0
         NumPanes = 4
         Configuration = "(H (1[40] 4[20] 2[20] 3) )"
      End
      Begin PaneConfiguration = 1
         NumPanes = 3
         Configuration = "(H (1 [50] 4 [25] 3))"
      End
      Begin PaneConfiguration = 2
         NumPanes = 3
         Configuration = "(H (1 [50] 2 [25] 3))"
      End
      Begin PaneConfiguration = 3
         NumPanes = 3
         Configuration = "(H (4 [30] 2 [40] 3))"
      End
      Begin PaneConfiguration = 4
         NumPanes = 2
         Configuration = "(H (1 [56] 3))"
      End
      Begin PaneConfiguration = 5
         NumPanes = 2
         Configuration = "(H (2 [66] 3))"
      End
      Begin PaneConfiguration = 6
         NumPanes = 2
         Configuration = "(H (4 [50] 3))"
      End
      Begin PaneConfiguration = 7
         NumPanes = 1
         Configuration = "(V (3))"
      End
      Begin PaneConfiguration = 8
         NumPanes = 3
         Configuration = "(H (1[56] 4[18] 2) )"
      End
      Begin PaneConfiguration = 9
         NumPanes = 2
         Configuration = "(H (1 [75] 4))"
      End
      Begin PaneConfiguration = 10
         NumPanes = 2
         Configuration = "(H (1[66] 2) )"
      End
      Begin PaneConfiguration = 11
         NumPanes = 2
         Configuration = "(H (4 [60] 2))"
      End
      Begin PaneConfiguration = 12
         NumPanes = 1
         Configuration = "(H (1) )"
      End
      Begin PaneConfiguration = 13
         NumPanes = 1
         Configuration = "(V (4))"
      End
      Begin PaneConfiguration = 14
         NumPanes = 1
         Configuration = "(V (2))"
      End
      ActivePaneConfig = 0
   End
   Begin DiagramPane = 
      Begin Origin = 
         Top = -172
         Left = 0
      End
      Begin Tables = 
         Begin Table = "ChiTietHoaDon"
            Begin Extent = 
               Top = 6
               Left = 38
               Bottom = 125
               Right = 198
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "hoadon"
            Begin Extent = 
               Top = 6
               Left = 434
               Bottom = 125
               Right = 594
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "KhachHang"
            Begin Extent = 
               Top = 114
               Left = 236
               Bottom = 233
               Right = 396
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "loai"
            Begin Extent = 
               Top = 126
               Left = 38
               Bottom = 215
               Right = 198
            End
            DisplayFlags = 280
            TopColumn = 0
         End
         Begin Table = "sach"
            Begin Extent = 
               Top = 126
               Left = 434
               Bottom = 245
               Right = 594
            End
            DisplayFlags = 280
            TopColumn = 0
         End
      End
   End
   Begin SQLPane = 
   End
   Begin DataPane = 
      Begin ParameterDefaults = ""
      End
   End
   Begin CriteriaPane = 
      Begin ColumnWidths = 11
         Column = 1440
         Alias = 900
         Table = 1170
         Output = 720
         Append = 1400
         NewValue = 1170
         SortType = 1350
         SortOrder = 1410
         GroupBy = 1350
         Filter = 1350
         Or = 1350
         Or = 1350
         Or =' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VTamBay'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPane2', @value=N' 1350
      End
   End
End
' , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VTamBay'
GO
EXEC sys.sp_addextendedproperty @name=N'MS_DiagramPaneCount', @value=2 , @level0type=N'SCHEMA',@level0name=N'dbo', @level1type=N'VIEW',@level1name=N'VTamBay'
GO
USE [master]
GO
ALTER DATABASE [QLSach] SET  READ_WRITE 
GO
