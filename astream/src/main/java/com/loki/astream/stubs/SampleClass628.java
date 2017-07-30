package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass628 {

    @Ignore    private SampleClass629 sampleClass;

    public SampleClass628(){
        sampleClass = new SampleClass629();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}