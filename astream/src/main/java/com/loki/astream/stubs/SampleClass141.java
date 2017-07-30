package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass141 {

    @Ignore    private SampleClass142 sampleClass;

    public SampleClass141(){
        sampleClass = new SampleClass142();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}