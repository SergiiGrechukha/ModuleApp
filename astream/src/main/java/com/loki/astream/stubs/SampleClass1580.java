package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1580 {

    @Ignore    private SampleClass1581 sampleClass;

    public SampleClass1580(){
        sampleClass = new SampleClass1581();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}