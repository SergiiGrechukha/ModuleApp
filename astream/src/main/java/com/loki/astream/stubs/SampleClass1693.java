package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1693 {

    @Ignore    private SampleClass1694 sampleClass;

    public SampleClass1693(){
        sampleClass = new SampleClass1694();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}