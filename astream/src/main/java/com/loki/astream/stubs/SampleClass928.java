package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass928 {

    @Ignore    private SampleClass929 sampleClass;

    public SampleClass928(){
        sampleClass = new SampleClass929();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}