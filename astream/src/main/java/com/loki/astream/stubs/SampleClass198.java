package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass198 {

    @Ignore    private SampleClass199 sampleClass;

    public SampleClass198(){
        sampleClass = new SampleClass199();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}