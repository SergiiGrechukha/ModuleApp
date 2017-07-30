package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass29 {

    @Ignore    private SampleClass30 sampleClass;

    public SampleClass29(){
        sampleClass = new SampleClass30();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}