package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass315 {

    @Ignore    private SampleClass316 sampleClass;

    public SampleClass315(){
        sampleClass = new SampleClass316();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}