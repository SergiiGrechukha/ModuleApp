package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass884 {

    @Ignore    private SampleClass885 sampleClass;

    public SampleClass884(){
        sampleClass = new SampleClass885();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}