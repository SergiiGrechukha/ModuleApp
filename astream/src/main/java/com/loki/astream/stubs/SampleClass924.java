package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass924 {

    @Ignore    private SampleClass925 sampleClass;

    public SampleClass924(){
        sampleClass = new SampleClass925();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}