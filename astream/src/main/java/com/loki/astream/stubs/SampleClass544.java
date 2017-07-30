package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass544 {

    @Ignore    private SampleClass545 sampleClass;

    public SampleClass544(){
        sampleClass = new SampleClass545();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}