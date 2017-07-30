package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1616 {

    @Ignore    private SampleClass1617 sampleClass;

    public SampleClass1616(){
        sampleClass = new SampleClass1617();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}