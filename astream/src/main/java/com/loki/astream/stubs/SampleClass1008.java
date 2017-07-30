package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1008 {

    @Ignore    private SampleClass1009 sampleClass;

    public SampleClass1008(){
        sampleClass = new SampleClass1009();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}