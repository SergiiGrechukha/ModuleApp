package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass237 {

    @Ignore    private SampleClass238 sampleClass;

    public SampleClass237(){
        sampleClass = new SampleClass238();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}