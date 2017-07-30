package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass390 {

    @Ignore    private SampleClass391 sampleClass;

    public SampleClass390(){
        sampleClass = new SampleClass391();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}