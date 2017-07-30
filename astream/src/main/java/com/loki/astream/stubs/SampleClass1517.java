package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1517 {

    @Ignore    private SampleClass1518 sampleClass;

    public SampleClass1517(){
        sampleClass = new SampleClass1518();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}