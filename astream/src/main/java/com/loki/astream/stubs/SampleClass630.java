package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass630 {

    @Ignore    private SampleClass631 sampleClass;

    public SampleClass630(){
        sampleClass = new SampleClass631();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}