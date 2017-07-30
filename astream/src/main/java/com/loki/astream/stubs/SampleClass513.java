package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass513 {

    @Ignore    private SampleClass514 sampleClass;

    public SampleClass513(){
        sampleClass = new SampleClass514();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}