package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass496 {

    @Ignore    private SampleClass497 sampleClass;

    public SampleClass496(){
        sampleClass = new SampleClass497();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}