package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass270 {

    @Ignore    private SampleClass271 sampleClass;

    public SampleClass270(){
        sampleClass = new SampleClass271();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}