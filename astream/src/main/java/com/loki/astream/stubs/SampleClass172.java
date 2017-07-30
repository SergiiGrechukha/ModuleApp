package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass172 {

    @Ignore    private SampleClass173 sampleClass;

    public SampleClass172(){
        sampleClass = new SampleClass173();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}