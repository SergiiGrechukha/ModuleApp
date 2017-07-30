package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass226 {

    @Ignore    private SampleClass227 sampleClass;

    public SampleClass226(){
        sampleClass = new SampleClass227();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}