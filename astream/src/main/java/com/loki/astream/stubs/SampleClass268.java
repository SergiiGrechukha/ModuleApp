package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass268 {

    @Ignore    private SampleClass269 sampleClass;

    public SampleClass268(){
        sampleClass = new SampleClass269();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}