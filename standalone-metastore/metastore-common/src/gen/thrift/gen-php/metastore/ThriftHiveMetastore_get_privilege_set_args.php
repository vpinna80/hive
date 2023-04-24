<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class ThriftHiveMetastore_get_privilege_set_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'hiveObject',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\metastore\HiveObjectRef',
        ),
        2 => array(
            'var' => 'user_name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'group_names',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var \metastore\HiveObjectRef
     */
    public $hiveObject = null;
    /**
     * @var string
     */
    public $user_name = null;
    /**
     * @var string[]
     */
    public $group_names = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['hiveObject'])) {
                $this->hiveObject = $vals['hiveObject'];
            }
            if (isset($vals['user_name'])) {
                $this->user_name = $vals['user_name'];
            }
            if (isset($vals['group_names'])) {
                $this->group_names = $vals['group_names'];
            }
        }
    }

    public function getName()
    {
        return 'ThriftHiveMetastore_get_privilege_set_args';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRUCT) {
                        $this->hiveObject = new \metastore\HiveObjectRef();
                        $xfer += $this->hiveObject->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->user_name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::LST) {
                        $this->group_names = array();
                        $_size1751 = 0;
                        $_etype1754 = 0;
                        $xfer += $input->readListBegin($_etype1754, $_size1751);
                        for ($_i1755 = 0; $_i1755 < $_size1751; ++$_i1755) {
                            $elem1756 = null;
                            $xfer += $input->readString($elem1756);
                            $this->group_names []= $elem1756;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('ThriftHiveMetastore_get_privilege_set_args');
        if ($this->hiveObject !== null) {
            if (!is_object($this->hiveObject)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('hiveObject', TType::STRUCT, 1);
            $xfer += $this->hiveObject->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->user_name !== null) {
            $xfer += $output->writeFieldBegin('user_name', TType::STRING, 2);
            $xfer += $output->writeString($this->user_name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->group_names !== null) {
            if (!is_array($this->group_names)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('group_names', TType::LST, 3);
            $output->writeListBegin(TType::STRING, count($this->group_names));
            foreach ($this->group_names as $iter1757) {
                $xfer += $output->writeString($iter1757);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
