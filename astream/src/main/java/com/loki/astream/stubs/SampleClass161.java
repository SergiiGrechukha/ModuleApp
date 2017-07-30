package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass161 {

    @Ignore    private SampleClass162 sampleClass;

    public SampleClass161(){
        sampleClass = new SampleClass162();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}