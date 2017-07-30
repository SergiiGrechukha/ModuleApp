package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1679 {

    @Ignore    private SampleClass1680 sampleClass;

    public SampleClass1679(){
        sampleClass = new SampleClass1680();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}