package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass292 {

    @Ignore    private SampleClass293 sampleClass;

    public SampleClass292(){
        sampleClass = new SampleClass293();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}