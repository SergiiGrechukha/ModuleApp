package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1857 {

    @Ignore    private SampleClass1858 sampleClass;

    public SampleClass1857(){
        sampleClass = new SampleClass1858();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}