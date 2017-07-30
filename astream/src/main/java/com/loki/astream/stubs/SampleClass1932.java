package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1932 {

    @Ignore    private SampleClass1933 sampleClass;

    public SampleClass1932(){
        sampleClass = new SampleClass1933();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}