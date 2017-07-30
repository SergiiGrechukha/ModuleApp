package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1544 {

    @Ignore    private SampleClass1545 sampleClass;

    public SampleClass1544(){
        sampleClass = new SampleClass1545();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}