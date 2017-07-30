package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1552 {

    @Ignore    private SampleClass1553 sampleClass;

    public SampleClass1552(){
        sampleClass = new SampleClass1553();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}