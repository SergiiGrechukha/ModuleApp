package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1103 {

    @Ignore    private SampleClass1104 sampleClass;

    public SampleClass1103(){
        sampleClass = new SampleClass1104();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}