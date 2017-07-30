package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1184 {

    @Ignore    private SampleClass1185 sampleClass;

    public SampleClass1184(){
        sampleClass = new SampleClass1185();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}