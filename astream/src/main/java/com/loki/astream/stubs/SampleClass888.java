package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass888 {

    @Ignore    private SampleClass889 sampleClass;

    public SampleClass888(){
        sampleClass = new SampleClass889();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}