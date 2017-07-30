package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass518 {

    @Ignore    private SampleClass519 sampleClass;

    public SampleClass518(){
        sampleClass = new SampleClass519();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}