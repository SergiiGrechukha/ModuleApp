package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass543 {

    @Ignore    private SampleClass544 sampleClass;

    public SampleClass543(){
        sampleClass = new SampleClass544();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}