package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass463 {

    @Ignore    private SampleClass464 sampleClass;

    public SampleClass463(){
        sampleClass = new SampleClass464();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}