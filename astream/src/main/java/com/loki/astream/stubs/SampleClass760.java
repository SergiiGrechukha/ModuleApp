package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass760 {

    @Ignore    private SampleClass761 sampleClass;

    public SampleClass760(){
        sampleClass = new SampleClass761();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}