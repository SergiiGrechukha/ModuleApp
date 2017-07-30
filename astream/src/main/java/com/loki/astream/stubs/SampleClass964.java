package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass964 {

    @Ignore    private SampleClass965 sampleClass;

    public SampleClass964(){
        sampleClass = new SampleClass965();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}