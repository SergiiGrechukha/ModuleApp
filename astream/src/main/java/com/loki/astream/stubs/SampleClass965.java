package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass965 {

    @Ignore    private SampleClass966 sampleClass;

    public SampleClass965(){
        sampleClass = new SampleClass966();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}