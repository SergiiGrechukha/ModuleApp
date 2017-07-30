package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass240 {

    @Ignore    private SampleClass241 sampleClass;

    public SampleClass240(){
        sampleClass = new SampleClass241();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}