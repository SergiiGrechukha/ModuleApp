package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1907 {

    @Ignore    private SampleClass1908 sampleClass;

    public SampleClass1907(){
        sampleClass = new SampleClass1908();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}