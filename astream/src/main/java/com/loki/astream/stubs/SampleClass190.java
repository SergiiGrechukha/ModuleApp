package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass190 {

    @Ignore    private SampleClass191 sampleClass;

    public SampleClass190(){
        sampleClass = new SampleClass191();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}